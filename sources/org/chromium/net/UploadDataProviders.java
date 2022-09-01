package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new owg(new owd(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new owg(new owd(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new owe(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new owe(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
