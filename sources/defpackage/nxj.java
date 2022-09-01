package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: PG */
/* renamed from: nxj  reason: default package */
/* loaded from: classes2.dex */
final class nxj implements Closeable {
    private Parcel a;

    public nxj(Parcel parcel) {
        this.a = parcel;
    }

    public static nxj c() {
        return new nxj(Parcel.obtain());
    }

    public final Parcel a() {
        jdg.G(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel a = a();
        this.a = null;
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
