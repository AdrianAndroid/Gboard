package defpackage;

import android.os.ParcelFileDescriptor;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* renamed from: owd  reason: default package */
/* loaded from: classes2.dex */
public final class owd implements owf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public owd(ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.b = i;
        this.a = parcelFileDescriptor;
    }

    public owd(File file, int i) {
        this.b = i;
        this.a = file;
    }

    @Override // defpackage.owf
    public final FileChannel a() {
        if (this.b == 0) {
            if (((ParcelFileDescriptor) this.a).getStatSize() != -1) {
                return FileInputStreamWrapper.getChannel(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) this.a));
            }
            ((ParcelFileDescriptor) this.a).close();
            StringBuilder sb = new StringBuilder("Not a file: ");
            Object obj = this.a;
            sb.append(obj);
            throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(obj)));
        }
        return FileInputStreamWrapper.getChannel(new FileInputStream((File) this.a));
    }
}
