package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: nif  reason: default package */
/* loaded from: classes2.dex */
final class nif extends nig {
    public nif(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.nig
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.nig
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(l(obj, j));
    }

    @Override // defpackage.nig
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(k(obj, j));
    }

    @Override // defpackage.nig
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nig
    public final void e(Object obj, long j, boolean z) {
        if (!nih.d) {
            nih.p(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            nih.o(obj, j, z);
        }
    }

    @Override // defpackage.nig
    public final void f(Object obj, long j, byte b) {
        if (!nih.d) {
            nih.p(obj, j, b);
        } else {
            nih.o(obj, j, b);
        }
    }

    @Override // defpackage.nig
    public final void g(Object obj, long j, double d) {
        p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.nig
    public final void h(Object obj, long j, float f) {
        o(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.nig
    public final boolean i(Object obj, long j) {
        if (!nih.d) {
            return nih.y(obj, j);
        }
        return nih.x(obj, j);
    }
}
