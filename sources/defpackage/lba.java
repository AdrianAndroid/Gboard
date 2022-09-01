package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: lba  reason: default package */
/* loaded from: classes.dex */
public final class lba implements npe {
    private final /* synthetic */ int a;
    private final Object b;

    public lba(jlr jlrVar, int i) {
        this.a = i;
        this.b = jlrVar;
    }

    public lba(lbi lbiVar, int i, byte[] bArr) {
        this.a = i;
        this.b = lbiVar;
    }

    public lba(mok mokVar, int i, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = mokVar;
    }

    public static Context c(jlr jlrVar) {
        Object obj = jlrVar.a;
        nxp.X(obj);
        return (Context) obj;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? b() : b();
        }
        return b();
    }

    public final Context b() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? (Context) ((mok) this.b).b : c((jlr) this.b);
        }
        Object obj = ((lbi) this.b).a;
        nxp.X(obj);
        return (Context) obj;
    }
}
