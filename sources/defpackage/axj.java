package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: axj  reason: default package */
/* loaded from: classes.dex */
final class axj implements auw {
    private static final bgf b = new bgf(50);
    private final axn c;
    private final auw d;
    private final auw e;
    private final int f;
    private final int g;
    private final Class h;
    private final ava i;
    private final ave j;

    public axj(axn axnVar, auw auwVar, auw auwVar2, int i, int i2, ave aveVar, Class cls, ava avaVar) {
        this.c = axnVar;
        this.d = auwVar;
        this.e = auwVar2;
        this.f = i;
        this.g = i2;
        this.j = aveVar;
        this.h = cls;
        this.i = avaVar;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        ave aveVar = this.j;
        if (aveVar != null) {
            aveVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        bgf bgfVar = b;
        byte[] bArr2 = (byte[]) bgfVar.f(this.h);
        if (bArr2 == null) {
            bArr2 = this.h.getName().getBytes(a);
            bgfVar.g(this.h, bArr2);
        }
        messageDigest.update(bArr2);
        this.c.c(bArr);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof axj) {
            axj axjVar = (axj) obj;
            if (this.g == axjVar.g && this.f == axjVar.f && bgj.m(this.j, axjVar.j) && this.h.equals(axjVar.h) && this.d.equals(axjVar.d) && this.e.equals(axjVar.e) && this.i.equals(axjVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        ave aveVar = this.j;
        if (aveVar != null) {
            hashCode = (hashCode * 31) + aveVar.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        int i2 = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.i);
        return "ResourceCacheKey{sourceKey=" + valueOf + ", signature=" + valueOf2 + ", width=" + i + ", height=" + i2 + ", decodedResourceClass=" + valueOf3 + ", transformation='" + valueOf4 + "', options=" + valueOf5 + "}";
    }
}
