package defpackage;

import android.content.Context;
import android.view.contentcapture.DataRemovalRequest;

/* compiled from: PG */
/* renamed from: fdb  reason: default package */
/* loaded from: classes.dex */
final class fdb extends iye {
    final /* synthetic */ fdc a;

    public fdb(fdc fdcVar) {
        this.a = fdcVar;
    }

    @Override // defpackage.iye
    public final void a() {
        Context context = this.a.a;
        if (context == null) {
            return;
        }
        fdg.a();
        ((ltd) ((ltd) fdg.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "clearUserData", 274, "InputContextSharingService.java")).w("clearUserData() for LocusID: %s", fdg.b.getId());
        if (!fdg.f(context)) {
            ((ltd) ((ltd) fdg.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService", "clearUserData", 276, "InputContextSharingService.java")).t("ContentCapture not available. Failed to send removeData() request.");
        } else {
            fdg.c.removeData(new DataRemovalRequest.Builder().addLocusId(fdg.b, 0).build());
        }
    }
}
