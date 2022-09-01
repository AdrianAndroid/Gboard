package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;

/* compiled from: PG */
/* renamed from: cct  reason: default package */
/* loaded from: classes.dex */
public final class cct {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/contacts/ContactsLanguageModelUpdater");
    public final File b;
    private final Context c;

    public cct(Context context) {
        File file = new File(cbd.c.d(context), "Contacts.dict");
        this.c = context;
        this.b = file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Delight5Facilitator a() {
        return Delight5Facilitator.h(this.c);
    }

    public final mvm b() {
        return cbw.c(mvl.CONTACTS, this.b, a().q());
    }
}
