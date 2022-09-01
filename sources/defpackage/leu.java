package defpackage;

/* compiled from: PG */
/* renamed from: leu  reason: default package */
/* loaded from: classes.dex */
public final class leu extends lex {
    final /* synthetic */ String a = "null";
    final /* synthetic */ lex b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leu(lex lexVar, lex lexVar2) {
        super(lexVar2);
        this.b = lexVar;
    }

    @Override // defpackage.lex
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
