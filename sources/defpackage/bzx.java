package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bzx  reason: default package */
/* loaded from: classes.dex */
public final class bzx implements mix {
    private static final lug a = lug.i("Delight5Facilitator");
    private final Delight5Facilitator b;
    private final Context c;
    private final List d;
    private final ino e;

    public bzx(Context context, List list, ino inoVar, Delight5Facilitator delight5Facilitator) {
        this.c = context;
        this.d = list;
        this.e = inoVar;
        this.b = delight5Facilitator;
    }

    @Override // defpackage.mix
    public final mko a() {
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/BlocklistLoader", "call", 37, "BlocklistLoader.java")).t("Running blocklist loader");
        ArrayList arrayList = new ArrayList(this.d.size());
        for (Locale locale : this.d) {
            if (this.e.ak("pref_key_use_personalized_dicts")) {
                arrayList.add(this.b.h.b(bzw.a(this.c, locale)));
            } else {
                arrayList.add(this.b.h.d(bzw.a(this.c, locale)));
            }
        }
        return hiz.K(arrayList).f();
    }
}
