package io.hel.facade;

/**
 * author: hel
 * date: 2021/1/23 16:58
 * description:
 */
public class VideoConverterFacade {
    private VideoFile file;

    public VideoFile convert(String filename, String format) {
            file = new VideoFile(filename);
        String sourceCodec = new CodecFactory().extract(file);
        Object destinationCodec;
        if ("mp4".equalsIgnoreCase(format))
            destinationCodec = new MPEG4CompressionCodec();
        else
            destinationCodec = new OggCompressionCodec();
        byte[] buffer = BitrateReader.read(filename, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);
        result = new AudioMixer().fix(result);
        return new VideoFile(result);
    }
}
