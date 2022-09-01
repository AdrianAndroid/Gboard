package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fri  reason: default package */
/* loaded from: classes.dex */
public abstract class fri extends bkg implements frj {
    private int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public fri(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        fyb.ay(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.frj
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ftm f;
        if (obj != null && (obj instanceof frj)) {
            try {
                frj frjVar = (frj) obj;
                if (frjVar.e() != this.a || (f = frjVar.f()) == null) {
                    return false;
                }
                return Arrays.equals(hF(), (byte[]) ftl.c(f));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // defpackage.frj
    public final ftm f() {
        return ftl.b(hF());
    }

    public abstract byte[] hF();

    public final int hashCode() {
        return this.a;
    }

    public fri() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ftm f = f();
            parcel2.writeNoException();
            bkh.f(parcel2, f);
        } else if (i != 2) {
            return false;
        } else {
            int i2 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }
}
