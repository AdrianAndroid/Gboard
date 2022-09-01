package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: h  reason: default package */
/* loaded from: classes.dex */
public final class h {
    public final ArrayList a = new ArrayList();

    public final void a(i iVar) {
        this.a.clear();
        for (int i = 1; i < iVar.e; i++) {
            j jVar = ((j[]) iVar.g.c)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                jVar.e[i2] = 0.0f;
            }
            jVar.e[jVar.c] = 1.0f;
            if (jVar.h == 4) {
                this.a.add(jVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar2 = (j) this.a.get(i3);
            int i4 = jVar2.b;
            if (i4 != -1) {
                f fVar = iVar.c[i4].d;
                int i5 = fVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    j d = fVar.d(i6);
                    if (d != null) {
                        float b = fVar.b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = d.e;
                            fArr[i7] = fArr[i7] + (jVar2.e[i7] * b);
                        }
                        if (!this.a.contains(d)) {
                            this.a.add(d);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    jVar2.e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            j jVar = (j) this.a.get(i);
            new StringBuilder().append(jVar);
            String str2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = jVar.e;
                if (i2 < 6) {
                    String str3 = str2 + jVar.e[i2];
                    float[] fArr2 = jVar.e;
                    str2 = str3.concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            str = str.concat(str2);
        }
        return str;
    }
}
