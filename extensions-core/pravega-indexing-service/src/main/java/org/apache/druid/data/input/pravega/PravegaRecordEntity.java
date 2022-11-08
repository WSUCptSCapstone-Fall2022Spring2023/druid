package org.apache.druid.data.input.pravega;


import org.apache.druid.data.input.impl.ByteEntity;
import java.nio.ByteBuffer;

public class PravegaRecordEntity extends ByteEntity{

    public PravegaRecordEntity(ByteBuffer buffer) {
        super(buffer);
    }
}
