package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: PG */
/* renamed from: cw  reason: default package */
/* loaded from: classes.dex */
public final class cw implements pc {
    final /* synthetic */ ow a;
    private final /* synthetic */ int b;

    public /* synthetic */ cw(ap apVar, int i) {
        this.b = i;
        this.a = apVar;
    }

    public cw(cx cxVar, int i) {
        this.b = i;
        this.a = cxVar;
    }

    public /* synthetic */ cw(ow owVar, int i) {
        this.b = i;
        this.a = owVar;
    }

    @Override // defpackage.pc
    public final void a() {
        int i = this.b;
        if (i == 0) {
            da h = ((cx) this.a).h();
            h.f();
            this.a.J().a("androidx:appcompat");
            h.r();
        } else if (i == 1) {
            Object obj = ((ap) this.a).e.a;
            au auVar = (au) obj;
            auVar.e.l(auVar, (ar) obj, null);
        } else {
            ow owVar = this.a;
            Bundle a = owVar.J().a("android:support:activity-result");
            if (a == null) {
                return;
            }
            pf pfVar = owVar.g;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            pfVar.e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            pfVar.a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            pfVar.h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                String str = stringArrayList.get(i2);
                if (pfVar.c.containsKey(str)) {
                    Integer num = (Integer) pfVar.c.remove(str);
                    if (!pfVar.h.containsKey(str)) {
                        pfVar.b.remove(num);
                    }
                }
                pfVar.a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
            }
        }
    }
}
