package defpackage;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fzy  reason: default package */
/* loaded from: classes.dex */
public final class fzy extends Binder {
    private final String a;

    public fzy(String str) {
        this.a = str;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new IllegalStateException(this.a);
    }

    @Override // android.os.Binder, android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return null;
    }
}
