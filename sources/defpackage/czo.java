package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: czo  reason: default package */
/* loaded from: classes.dex */
public final class czo {
    public final File a;
    public final File b;
    public final llw c;
    public final lmz d;
    public final lnd e;
    public final lnd f;

    public czo() {
    }

    public czo(File file, File file2, llw llwVar, lmz lmzVar, lnd lndVar, lnd lndVar2) {
        this.a = file;
        this.b = file2;
        this.c = llwVar;
        this.d = lmzVar;
        this.e = lndVar;
        this.f = lndVar2;
    }

    public static emv b() {
        return new emv();
    }

    public final llp a() {
        return this.c.keySet().k();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czo) {
            czo czoVar = (czo) obj;
            if (this.a.equals(czoVar.a) && this.b.equals(czoVar.b) && lre.z(this.c, czoVar.c) && this.d.equals(czoVar.d) && this.e.equals(czoVar.e) && this.f.equals(czoVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        return "DynamicArtInformation{animationDir=" + valueOf + ", fontDir=" + valueOf2 + ", fileNameToTemplateInfoMap=" + valueOf3 + ", genericTemplateFileNames=" + valueOf4 + ", conceptToFileNameMap=" + valueOf5 + ", keywordToFileNameMap=" + valueOf6 + "}";
    }
}
