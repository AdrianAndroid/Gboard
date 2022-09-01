package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {
    l[] a;
    l b = null;
    p c;
    p d;
    int e;
    int f;
    int g;
    final int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(l[] lVarArr, int i, int i2, int i3) {
        this.a = lVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l c() {
        l[] lVarArr;
        int length;
        int i;
        p pVar;
        l lVar = this.b;
        if (lVar != null) {
            lVar = lVar.d;
        }
        while (lVar == null) {
            if (this.f < this.g && (lVarArr = this.a) != null && (length = lVarArr.length) > (i = this.e) && i >= 0) {
                l l = ConcurrentHashMap.l(lVarArr, i);
                if (l != null && l.a < 0) {
                    if (l instanceof g) {
                        this.a = ((g) l).e;
                        p pVar2 = this.d;
                        if (pVar2 != null) {
                            this.d = pVar2.d;
                        } else {
                            pVar2 = new p();
                        }
                        pVar2.c = lVarArr;
                        pVar2.a = length;
                        pVar2.b = i;
                        pVar2.d = this.c;
                        this.c = pVar2;
                        lVar = null;
                    } else if (l instanceof r) {
                        lVar = ((r) l).f;
                    } else {
                        lVar = null;
                    }
                } else {
                    lVar = l;
                }
                if (this.c != null) {
                    while (true) {
                        pVar = this.c;
                        if (pVar == null) {
                            break;
                        }
                        int i2 = this.e;
                        int i3 = pVar.a;
                        int i4 = i2 + i3;
                        this.e = i4;
                        if (i4 < length) {
                            break;
                        }
                        this.e = pVar.b;
                        this.a = pVar.c;
                        pVar.c = null;
                        p pVar3 = pVar.d;
                        pVar.d = this.d;
                        this.c = pVar3;
                        this.d = pVar;
                        length = i3;
                    }
                    if (pVar == null) {
                        int i5 = this.e + this.h;
                        this.e = i5;
                        if (i5 >= length) {
                            int i6 = this.f + 1;
                            this.f = i6;
                            this.e = i6;
                        }
                    }
                } else {
                    int i7 = i + this.h;
                    this.e = i7;
                    if (i7 >= length) {
                        int i8 = this.f + 1;
                        this.f = i8;
                        this.e = i8;
                    }
                }
            } else {
                this.b = null;
                return null;
            }
        }
        this.b = lVar;
        return lVar;
    }
}
