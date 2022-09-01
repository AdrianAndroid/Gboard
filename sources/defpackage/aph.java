package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: aph  reason: default package */
/* loaded from: classes.dex */
public final class aph implements apo {
    public final List a;

    public aph() {
        this.a = Collections.singletonList(new asi(new PointF(0.0f, 0.0f)));
    }

    public aph(List list) {
        this.a = list;
    }

    @Override // defpackage.apo
    public final aoh a() {
        if (((asi) this.a.get(0)).e()) {
            return new aop(this.a);
        }
        return new aoo(this.a);
    }

    @Override // defpackage.apo
    public final List b() {
        return this.a;
    }

    @Override // defpackage.apo
    public final boolean c() {
        return this.a.size() == 1 && ((asi) this.a.get(0)).e();
    }
}
