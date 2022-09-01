package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: cax  reason: default package */
/* loaded from: classes.dex */
public final class cax {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/DynamicLanguageModelPruner");
    public static final Duration b = Duration.ofDays(63);
    public final Delight5Facilitator c;
    public final Context d;

    public cax(Delight5Facilitator delight5Facilitator, Context context) {
        this.c = delight5Facilitator;
        this.d = context;
    }

    public final boolean a(mvm mvmVar) {
        return new caw(this).b(this.c, mvmVar);
    }
}
