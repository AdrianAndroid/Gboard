package j$.wrapper.java.nio.channels;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends FileChannel implements ByteChannel {
    private final FileChannel a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FileChannel fileChannel) {
        this.a = fileChannel;
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    /* renamed from: a */
    public final a mo63position(long j) {
        try {
            return (a) b.a(this.a.position(j));
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    /* renamed from: b */
    public final a mo64truncate(long j) {
        try {
            return (a) b.a(this.a.truncate(j));
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) {
        try {
            this.a.force(z);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() {
        try {
            Method declaredMethod = AbstractInterruptibleChannel.class.getDeclaredMethod("implCloseChannel", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.a, new Object[0]);
        } catch (ReflectiveOperationException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof IOException)) {
                throw new AssertionError(e);
            }
            throw j$.wrapper.java.nio.file.b.a((IOException) cause);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j, long j2, boolean z) {
        try {
            return this.a.lock(j, j2, z);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        try {
            return this.a.map(mapMode, j, j2);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long position() {
        try {
            return this.a.position();
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        try {
            return this.a.read(byteBuffer);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j) {
        try {
            return this.a.read(byteBuffer, j);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        try {
            return this.a.read(byteBufferArr, i, i2);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long size() {
        try {
            return this.a.size();
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        try {
            return this.a.transferFrom(readableByteChannel, j, j2);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        try {
            return this.a.transferTo(j, j2, writableByteChannel);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j, long j2, boolean z) {
        try {
            return this.a.tryLock(j, j2, z);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        try {
            return this.a.write(byteBuffer);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j) {
        try {
            return this.a.write(byteBuffer, j);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        try {
            return this.a.write(byteBufferArr, i, i2);
        } catch (IOException e) {
            throw j$.wrapper.java.nio.file.b.a(e);
        }
    }
}
