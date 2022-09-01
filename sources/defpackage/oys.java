package defpackage;

import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: oys  reason: default package */
/* loaded from: classes2.dex */
public abstract class oys {
    public int a;
    public String b;

    public static oys c(int i) {
        if (i != 0) {
            if (i == 1) {
                return new oyq();
            }
            if (i == 4) {
                return new oyr();
            }
            if (i == 10) {
                try {
                    return new oyu();
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            throw new oyl("Unsupported Check ID " + i);
        }
        return new oyt();
    }

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract byte[] b();
}
