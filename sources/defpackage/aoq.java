package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aoq  reason: default package */
/* loaded from: classes.dex */
public final class aoq extends aom {
    private final ask e = new ask();

    public aoq(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* synthetic */ Object f(asi asiVar, float f) {
        Object obj;
        Object obj2 = asiVar.b;
        if (obj2 == null || (obj = asiVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ask askVar = (ask) obj2;
        ask askVar2 = (ask) obj;
        asj asjVar = this.d;
        if (asjVar != null) {
            float f2 = asiVar.g;
            asiVar.h.floatValue();
            c();
            ask askVar3 = (ask) asjVar.a();
            if (askVar3 != null) {
                return askVar3;
            }
        }
        ask askVar4 = this.e;
        float c = asc.c(askVar.a, askVar2.a, f);
        float f3 = askVar.b;
        float f4 = askVar2.b;
        askVar4.a = c;
        askVar4.b = asc.c(f3, f4, f);
        return this.e;
    }
}
