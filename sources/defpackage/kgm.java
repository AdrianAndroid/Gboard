package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: kgm  reason: default package */
/* loaded from: classes.dex */
final class kgm implements Comparable {
    final ool a;
    final File b;
    final kgm c;
    final int d;
    final boolean e;
    final String f;
    long g;

    public kgm(kgm kgmVar, boolean z, String str) {
        this.g = 0L;
        this.a = kgmVar.a;
        this.b = kgmVar.b;
        this.c = kgmVar;
        this.d = kgmVar.d + 1;
        this.e = z;
        if (kgmVar.d != 0) {
            str = kgmVar.f + "/" + str;
        }
        this.f = str;
    }

    public kgm(ool oolVar, File file) {
        this.g = 0L;
        this.a = oolVar;
        this.b = file;
        this.c = null;
        this.d = 0;
        this.e = true;
        this.f = "";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        kgm kgmVar = (kgm) obj;
        int i = this.d;
        int i2 = kgmVar.d;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        boolean z = this.e;
        if (z == kgmVar.e) {
            return this.f.compareTo(kgmVar.f);
        }
        return !z ? 1 : -1;
    }
}
