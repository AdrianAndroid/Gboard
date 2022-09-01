package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cal  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cal implements gzg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cal(bzv bzvVar, int i) {
        this.b = i;
        this.a = bzvVar;
    }

    public /* synthetic */ cal(Delight5Facilitator delight5Facilitator, int i) {
        this.b = i;
        this.a = delight5Facilitator;
    }

    @Override // defpackage.gzg
    public final void a(List list) {
        if (this.b == 0) {
            Object obj = this.a;
            if (list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Locale.forLanguageTag(((gzf) it.next()).c));
            }
            ((Delight5Facilitator) obj).y(arrayList);
            return;
        }
        ((bzv) this.a).d = gzc.b.d();
    }
}
