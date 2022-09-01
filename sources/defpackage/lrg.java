package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lrg  reason: default package */
/* loaded from: classes.dex */
public final class lrg extends lrc implements Serializable {
    static final lrc a = new lrg();
    private static final long serialVersionUID = 0;

    private lrg() {
    }

    @Override // defpackage.lrc, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        lrh lrhVar = (lrh) obj;
        lrh lrhVar2 = (lrh) obj2;
        return lkk.b.c(lrhVar.b, lrhVar2.b).c(lrhVar.c, lrhVar2.c).a();
    }
}
