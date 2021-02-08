package com.danilopaixao.design.builder;

public class FileGeneratorBuilder {
    private FileGenerator instance;

    public FileGeneratorBuilder generateXml() {
        instance = new XmlFileGenerator();
        return this;
    }

    public FileGeneratorBuilder generateProperties() {
        instance = new PropertyFileGenerator();
        return this;
    }

    public FileGeneratorBuilder withCriptografy() {
        addProcessor(new Criptografier());
        return this;
    }

    public FileGeneratorBuilder withCompress() {
        addProcessor(new Compresser());
        return this;
    }

    private void addProcessor(PosProcessor p) {
        PosProcessor current = instance.getProcessor();
        if (current instanceof NullProcessor) {
            setProcessor(p);
        } else {
            PosProcessorComposed processor = new PosProcessorComposed();
            processor.add(current);
            processor.add(p);
            instance.setProcessador(processor);
        }
    }

    private void setProcessor(PosProcessor p) {
    }

    public FileGeneratorBuilder withAsync() {
        instance = new AsyncProcess(instance);
        return this;
    }

    public FileGeneratorBuilder withLog() {
        instance = new LoggerProxy(instance);
        return this;
    }

    public FileGenerator build() {
        return instance;
    }
}
