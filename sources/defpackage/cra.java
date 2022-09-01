package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: cra  reason: default package */
/* loaded from: classes.dex */
public final class cra {
    private static final lgb j = jdg.o(true);
    public final cqp a;
    public final int b;
    public final EditorInfo c;
    public final boolean d;
    public final lfb e;
    public final lfb f;
    public final lfb g;
    public final lfb h;
    public final lfb i;

    public cra() {
    }

    public cra(cqp cqpVar, int i, EditorInfo editorInfo, boolean z, lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4, lfb lfbVar5) {
        this.a = cqpVar;
        this.b = i;
        this.c = editorInfo;
        this.d = z;
        this.e = lfbVar;
        this.f = lfbVar2;
        this.g = lfbVar3;
        this.h = lfbVar4;
        this.i = lfbVar5;
    }

    public static cqz a() {
        cqz cqzVar = new cqz((byte[]) null);
        cqzVar.f = (byte) (cqzVar.f | 4);
        cqzVar.f(j);
        cqzVar.c(0);
        cqzVar.b = hsu.f();
        cqzVar.f = (byte) (cqzVar.f | 2);
        return cqzVar;
    }

    public final cqz b() {
        return new cqz(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cra) {
            cra craVar = (cra) obj;
            if (this.a.equals(craVar.a) && this.b == craVar.b && this.c.equals(craVar.c) && this.d == craVar.d && this.e.equals(craVar.e) && this.f.equals(craVar.f) && this.g.equals(craVar.g) && this.h.equals(craVar.h) && this.i.equals(craVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        return "ImageShareRequest{image=" + valueOf + ", position=" + i + ", editorInfo=" + valueOf2 + ", incognito=" + z + ", disableShareIntent=false, validateShareSupplier=" + valueOf3 + ", recentImages=" + valueOf4 + ", concept=" + valueOf5 + ", keyword=" + valueOf6 + ", emoji=" + valueOf7 + "}";
    }
}
