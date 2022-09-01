package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: edk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class edk implements hho {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ edk(ebe ebeVar, Context context, int i) {
        this.c = i;
        this.b = ebeVar;
        this.a = context;
    }

    public /* synthetic */ edk(edl edlVar, Context context, int i) {
        this.c = i;
        this.b = edlVar;
        this.a = context;
    }

    public /* synthetic */ edk(eev eevVar, Context context, int i) {
        this.c = i;
        this.b = eevVar;
        this.a = context;
    }

    public /* synthetic */ edk(efw efwVar, Context context, int i) {
        this.c = i;
        this.b = efwVar;
        this.a = context;
    }

    public /* synthetic */ edk(ejy ejyVar, Context context, int i) {
        this.c = i;
        this.b = ejyVar;
        this.a = context;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.b;
            Context context = this.a;
            edl edlVar = (edl) obj;
            edlVar.p = false;
            edlVar.r = cuz.a.i(context);
            edlVar.o = new dbr(obj, context, edlVar.f());
        } else if (i == 1) {
            Object obj2 = this.b;
            Context context2 = this.a;
            ebe ebeVar = (ebe) obj2;
            ebeVar.d = false;
            ebeVar.d(context2);
            ebeVar.c = new dbr(obj2, context2, ebeVar.c());
        } else if (i == 2) {
            Object obj3 = this.b;
            Context context3 = this.a;
            eev eevVar = (eev) obj3;
            eevVar.d = false;
            eevVar.c = new dbr(obj3, context3, R.xml.f210220_resource_name_obfuscated_res_0x7f170111);
        } else if (i == 3) {
            Object obj4 = this.b;
            Context context4 = this.a;
            efw efwVar = (efw) obj4;
            efwVar.n = false;
            efwVar.m = new dbr(obj4, context4, efwVar.ak());
        } else {
            Object obj5 = this.b;
            Context context5 = this.a;
            ejy ejyVar = (ejy) obj5;
            ejyVar.n = false;
            ejyVar.m = new dbr(obj5, context5, ejyVar.f());
        }
    }
}
