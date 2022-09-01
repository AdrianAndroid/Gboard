package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements g {
    private final g[] a;
    private final boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ArrayList arrayList, boolean z) {
        this((g[]) arrayList.toArray(new g[arrayList.size()]), z);
    }

    f(g[] gVarArr, boolean z) {
        this.a = gVarArr;
        this.b = z;
    }

    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            rVar.g();
        }
        try {
            for (g gVar : this.a) {
                if (!gVar.a(rVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                rVar.a();
            }
            return true;
        } finally {
            if (z) {
                rVar.a();
            }
        }
    }

    public final f b() {
        return !this.b ? this : new f(this.a, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        g[] gVarArr = this.a;
        if (gVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (g gVar : gVarArr) {
                sb.append(gVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
