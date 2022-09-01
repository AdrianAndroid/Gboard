package defpackage;

/* compiled from: PG */
/* renamed from: lsp  reason: default package */
/* loaded from: classes.dex */
public final class lsp extends lje {
    public final lrh a;
    public final Object b;

    public lsp(lrh lrhVar, Object obj) {
        this.a = lrhVar;
        this.b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lkp a() {
        return this.a.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lkp b() {
        return this.a.c;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }
}
