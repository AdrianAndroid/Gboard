package defpackage;

import android.util.Pair;
import com.google.android.apps.inputmethod.libs.crash.UserFeedbackActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: byp  reason: default package */
/* loaded from: classes.dex */
public final class byp extends fyb {
    final /* synthetic */ UserFeedbackActivity a;

    public byp(UserFeedbackActivity userFeedbackActivity) {
        this.a = userFeedbackActivity;
    }

    @Override // defpackage.fyb
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Pair.create("app-version-agsa", byo.a(this.a.getApplicationContext())));
        return arrayList;
    }
}
