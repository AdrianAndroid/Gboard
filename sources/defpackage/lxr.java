package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxr  reason: default package */
/* loaded from: classes.dex */
public final class lxr extends lxt implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public lxr(byte[] bArr) {
        this.a = (byte[]) jdg.u(bArr);
    }

    @Override // defpackage.lxt
    public final int a() {
        int length = this.a.length;
        jdg.H(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.lxt
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.lxt
    public final long c() {
        int length = this.a.length;
        jdg.H(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.lxt
    public final boolean d(lxt lxtVar) {
        if (this.a.length == lxtVar.f().length) {
            int i = 0;
            boolean z = true;
            while (true) {
                byte[] bArr = this.a;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == lxtVar.f()[i];
                i++;
            }
        } else {
            return false;
        }
    }

    @Override // defpackage.lxt
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.lxt
    public final byte[] f() {
        return this.a;
    }
}
