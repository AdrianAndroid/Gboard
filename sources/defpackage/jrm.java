package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jrm  reason: default package */
/* loaded from: classes.dex */
public final class jrm extends jtm {
    private final llp a;
    private final llp b;
    private final int c;
    private final boolean d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private volatile transient llp h;

    public jrm(llp llpVar, llp llpVar2, int i, boolean z, String str, boolean z2, boolean z3) {
        if (llpVar != null) {
            this.a = llpVar;
            if (llpVar2 != null) {
                this.b = llpVar2;
                this.c = i;
                this.d = z;
                this.e = str;
                this.f = z2;
                this.g = z3;
                return;
            }
            throw new NullPointerException("Null rows");
        }
        throw new NullPointerException("Null columns");
    }

    @Override // defpackage.jtm
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jtm
    public final llp b() {
        return this.a;
    }

    @Override // defpackage.jtm
    public final llp c() {
        return this.b;
    }

    @Override // defpackage.jtm
    public final String d() {
        return this.e;
    }

    @Override // defpackage.jtm
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtm) {
            jtm jtmVar = (jtm) obj;
            if (lre.I(this.a, jtmVar.b()) && lre.I(this.b, jtmVar.c())) {
                jtmVar.j();
                if (this.c == jtmVar.a() && this.d == jtmVar.g() && ((str = this.e) != null ? str.equals(jtmVar.d()) : jtmVar.d() == null)) {
                    jtmVar.k();
                    if (this.f == jtmVar.f()) {
                        jtmVar.i();
                        if (this.g == jtmVar.e()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jtm
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.jtm
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.jtm
    public final llp h() {
        int i;
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        llp llpVar = this.a;
                        if (i2 >= ((lrl) llpVar).c) {
                            break;
                        }
                        jtj jtjVar = (jtj) llpVar.get(i2);
                        if (jtjVar.e) {
                            String str = jtjVar.a;
                            i = str != null ? str.length() : 0;
                            llp llpVar2 = this.b;
                            int i3 = ((lrl) llpVar2).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = ((List) llpVar2.get(i4)).get(i2);
                                i = Math.max(i, obj == null ? 0 : obj.toString().length());
                            }
                        } else {
                            i = 0;
                        }
                        arrayList.add(Integer.valueOf(jtm.l(i, jtjVar.b, jtjVar.c)));
                        i2++;
                    }
                    int size = arrayList.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        i5 += ((Integer) arrayList.get(i6)).intValue();
                    }
                    int l = jtm.l(i5, 0, this.c);
                    if (i5 != l) {
                        float f = l / i5;
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            arrayList.set(i7, Integer.valueOf(Math.round(((Integer) arrayList.get(i7)).intValue() * f)));
                        }
                    }
                    this.h = llp.o(arrayList);
                    if (this.h == null) {
                        throw new NullPointerException("columnWidths() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        String str = this.e;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231)) * (-721379959);
        if (true != this.g) {
            i = 1237;
        }
        return hashCode2 ^ i;
    }

    @Override // defpackage.jtm
    public final void i() {
    }

    @Override // defpackage.jtm
    public final void j() {
    }

    @Override // defpackage.jtm
    public final void k() {
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        int i = this.c;
        boolean z = this.d;
        String str = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        return "TablePrinter{columns=" + obj + ", rows=" + obj2 + ", minWidth=0, maxWidth=" + i + ", showColumnNames=" + z + ", emptyMessage=" + str + ", useEllipsis=false, isMultiline=" + z2 + ", headerBorder=\u0000, hideEmptyColumns=" + z3 + "}";
    }
}
