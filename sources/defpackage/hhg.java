package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: hhg  reason: default package */
/* loaded from: classes.dex */
public class hhg implements ijg {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/feedback/FillFeedbackPsdNotification");
    public final List b;
    public final List c;
    public final boolean d;

    private hhg(List list, List list2, boolean z) {
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public static void b(List list, List list2, boolean z) {
        ijl.b().g(new hhg(list, list2, z));
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }
}
