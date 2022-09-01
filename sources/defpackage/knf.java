package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* renamed from: knf  reason: default package */
/* loaded from: classes.dex */
public final class knf {
    public int a;
    public final Object b;
    public final Object c;

    public knf(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.b = colorStateList;
        this.a = i;
    }

    public knf(bnc bncVar, byte[] bArr) {
        this.b = bgq.b(150, new awu(this, 1, null, null));
        this.c = bncVar;
    }

    public knf(byte[] bArr, byte[] bArr2) {
        this.b = new SparseArray();
        this.a = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public static final long m(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public static knf n(int i) {
        return new knf(null, null, i);
    }

    public final void a(long j, int i) {
        boolean z = true;
        jdg.v(true);
        int i2 = 0;
        while (i2 < i) {
            boolean testBit = BigInteger.valueOf(j).testBit((i - i2) - 1);
            if (testBit) {
                testBit = true;
            }
            jdg.v(z);
            Object obj = this.c;
            int i3 = this.a;
            int[] iArr = (int[]) obj;
            int i4 = testBit ? 1 : 0;
            char c = testBit ? 1 : 0;
            iArr[i3] = i4;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = i3 + i5;
            this.a = i7;
            if (i7 == 8) {
                int i8 = iArr[0];
                char c2 = z ? 1 : 0;
                char c3 = z ? 1 : 0;
                int i9 = iArr[c2];
                int i10 = iArr[2];
                int i11 = iArr[3];
                int i12 = iArr[4];
                int i13 = iArr[5];
                int i14 = iArr[6];
                ((ByteArrayOutputStream) this.b).write((i8 << 7) | (i9 << 6) | (i10 << 5) | (i11 << 4) | (i12 << 3) | (i13 << 2) | (i14 + i14) | iArr[7]);
                this.a = 0;
            }
            i2++;
            z = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    public final void b(hff hffVar, int i, int... iArr) {
        hfg hfgVar = new hfg(hffVar, i, iArr);
        this.c.add(0, hfgVar);
        int i2 = this.a;
        int length = ((int[]) hfgVar.c).length;
        if (i2 < length) {
            this.a = length;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public final boolean c(KeyEvent keyEvent) {
        int size = this.b.size();
        int i = this.a;
        if (size == i) {
            this.b.remove(i - 1);
        }
        this.b.add(0, keyEvent);
        for (hfg hfgVar : this.c) {
            int size2 = this.b.size();
            int length = ((int[]) hfgVar.c).length;
            if (size2 >= length && ((KeyEvent) this.b.get(0)).hasModifiers(hfgVar.a)) {
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        KeyEvent keyEvent2 = (KeyEvent) this.b.get(i2);
                        if (keyEvent2.getKeyCode() == ((int[]) hfgVar.c)[i2] && keyEvent2.getAction() == ((int[]) hfgVar.d)[i2]) {
                            i2++;
                        }
                    } else if (hfgVar.b.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean d() {
        return this.c != null;
    }

    public final boolean e() {
        Object obj;
        return this.c == null && (obj = this.b) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean f(int[] iArr) {
        if (e()) {
            ColorStateList colorStateList = (ColorStateList) this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState == this.a) {
                return false;
            }
            this.a = colorForState;
            return true;
        }
        return false;
    }

    public final boolean g() {
        return d() || this.a != 0;
    }

    public final md h(int i) {
        md mdVar = (md) ((SparseArray) this.b).get(i);
        if (mdVar == null) {
            md mdVar2 = new md();
            ((SparseArray) this.b).put(i, mdVar2);
            return mdVar2;
        }
        return mdVar;
    }

    public final void i() {
        this.a++;
    }

    public final void j() {
        for (int i = 0; i < ((SparseArray) this.b).size(); i++) {
            md mdVar = (md) ((SparseArray) this.b).valueAt(i);
            ArrayList arrayList = mdVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                uq.d(((mo) arrayList.get(i2)).a);
            }
            mdVar.a.clear();
        }
    }

    public final void k() {
        this.a--;
    }

    public final void l(int i, int i2) {
        md h = h(i);
        h.b = i2;
        ArrayList arrayList = h.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public knf(byte[] bArr) {
        this.a = 2;
        this.c = lre.A();
        this.b = lre.A();
    }

    public knf() {
        this.b = new ByteArrayOutputStream();
        this.a = 0;
        this.c = new int[8];
    }
}
