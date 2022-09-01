package defpackage;

import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: adi  reason: default package */
/* loaded from: classes.dex */
public final class adi implements adb {
    public static final ur j = new ur((short[]) null);
    public static final ur k = new ur((int[]) null);
    public static final ur l = new ur((boolean[]) null);
    public static final ur m = new ur((byte[]) null);
    public static final ur n = new ur((float[]) null);
    public static final ur o = new ur((char[]) null);
    public final Object d;
    public final float f;
    public adj g;
    public float h;
    final ur i;
    private boolean s;
    float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean e = false;
    private long p = 0;
    private final ArrayList q = new ArrayList();
    private final ArrayList r = new ArrayList();

    public adi(Object obj, ur urVar, byte[] bArr) {
        this.d = obj;
        this.i = urVar;
        this.f = (urVar == l || urVar == m || urVar == n) ? 0.1f : urVar == o ? 0.00390625f : (urVar == j || urVar == k) ? 0.002f : 1.0f;
        this.g = null;
        this.h = Float.MAX_VALUE;
        this.s = false;
    }

    private static void d(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.adb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r24) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adi.a(long):void");
    }

    final void b(float f) {
        ((kvx) this.d).a(f / 10000.0f);
        for (int i = 0; i < this.r.size(); i++) {
            if (this.r.get(i) != null) {
                ((adh) this.r.get(i)).a();
            }
        }
        d(this.r);
    }

    public final void c() {
        if (this.g.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (ade.a().b()) {
            if (!this.e) {
                return;
            }
            this.s = true;
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }
}
