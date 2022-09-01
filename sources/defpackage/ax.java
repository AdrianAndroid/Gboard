package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ax  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ax implements aja {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ax(ap apVar, int i) {
        this.b = i;
        this.a = apVar;
    }

    public /* synthetic */ ax(bi biVar, int i) {
        this.b = i;
        this.a = biVar;
    }

    public ax(cx cxVar, int i) {
        this.b = i;
        this.a = cxVar;
    }

    public /* synthetic */ ax(ow owVar, int i) {
        this.b = i;
        this.a = owVar;
    }

    @Override // defpackage.aja
    public final Bundle a() {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            Bundle bundle = new Bundle();
            Parcelable b = ((bi) obj).b();
            if (b != null) {
                bundle.putParcelable("android:support:fragments", b);
            }
            return bundle;
        } else if (i == 1) {
            ap apVar = (ap) this.a;
            apVar.hD();
            apVar.d.c(afo.ON_STOP);
            return new Bundle();
        } else if (i == 2) {
            Bundle bundle2 = new Bundle();
            ((cx) this.a).h();
            return bundle2;
        } else {
            Object obj2 = this.a;
            Bundle bundle3 = new Bundle();
            pf pfVar = ((ow) obj2).g;
            bundle3.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(pfVar.c.values()));
            bundle3.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(pfVar.c.keySet()));
            bundle3.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(pfVar.e));
            bundle3.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) pfVar.h.clone());
            bundle3.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", pfVar.a);
            return bundle3;
        }
    }
}
