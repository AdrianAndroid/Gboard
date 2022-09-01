package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: mmv  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmv implements moi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmv(Context context, String str, int i) {
        this.c = i;
        this.b = context;
        this.a = str;
    }

    public /* synthetic */ mmv(mmk mmkVar, Context context, int i) {
        this.c = i;
        this.a = mmkVar;
        this.b = context;
    }

    public /* synthetic */ mmv(mmx mmxVar, mmr mmrVar, int i) {
        this.c = i;
        this.a = mmxVar;
        this.b = mmrVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mms, java.lang.Object] */
    @Override // defpackage.moi
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            ?? r0 = this.a;
            mmr mmrVar = (mmr) this.b;
            return mmrVar.c.a(new mnk(mmrVar, r0));
        } else if (i == 1) {
            Object obj = this.a;
            Object obj2 = this.b;
            mmk mmkVar = (mmk) obj;
            String d = mmkVar.d();
            mob mobVar = (mob) mmkVar.d.a(mob.class);
            return new oqv((Context) obj2, d);
        } else {
            return new mok((Context) this.b, (String) this.a);
        }
    }
}
