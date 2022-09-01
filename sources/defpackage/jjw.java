package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: jjw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jjw implements mix {
    public final /* synthetic */ jkk a;
    public final /* synthetic */ jiq b;
    public final /* synthetic */ jig c;
    public final /* synthetic */ miy d;
    public final /* synthetic */ List e;
    private final /* synthetic */ int f;

    public /* synthetic */ jjw(jkk jkkVar, jiq jiqVar, jig jigVar, miy miyVar, List list, int i) {
        this.f = i;
        this.a = jkkVar;
        this.b = jiqVar;
        this.c = jigVar;
        this.d = miyVar;
        this.e = list;
    }

    @Override // defpackage.mix
    public final mko a() {
        if (this.f != 0) {
            jkk jkkVar = this.a;
            jiq jiqVar = this.b;
            jig jigVar = this.c;
            return jkkVar.m(jkkVar.o(jiqVar, jigVar, this.d), new cvr(this.e, jigVar, jiqVar, 9));
        }
        jkk jkkVar2 = this.a;
        return jkkVar2.i.a(new jjw(jkkVar2, this.b, this.c, this.d, this.e, 1), jkkVar2.e);
    }
}
