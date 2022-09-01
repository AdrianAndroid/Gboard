package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lev  reason: default package */
/* loaded from: classes.dex */
final class lev extends lex {
    final /* synthetic */ lex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lev(lex lexVar, lex lexVar2) {
        super(lexVar2);
        this.a = lexVar;
    }

    @Override // defpackage.lex
    public final void b(Appendable appendable, Iterator it) {
        jdg.Q(it, "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.a.c);
                appendable.append(this.a.a(next2));
            }
        }
    }
}
