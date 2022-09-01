package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: app  reason: default package */
/* loaded from: classes.dex */
public abstract class app implements apo {
    public final List a;

    public app(Object obj) {
        this(Collections.singletonList(new asi(obj)));
    }

    public app(List list) {
        this.a = list;
    }

    @Override // defpackage.apo
    public final List b() {
        return this.a;
    }

    @Override // defpackage.apo
    public final boolean c() {
        if (!this.a.isEmpty()) {
            return this.a.size() == 1 && ((asi) this.a.get(0)).e();
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
