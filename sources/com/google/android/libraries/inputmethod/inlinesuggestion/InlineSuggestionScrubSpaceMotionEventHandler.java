package com.google.android.libraries.inputmethod.inlinesuggestion;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.motioneventhandler.ScrubMotionEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InlineSuggestionScrubSpaceMotionEventHandler extends ScrubMotionEventHandler {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionScrubSpaceMotionEventHandler");
    private boolean d;

    public InlineSuggestionScrubSpaceMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar, new ihc(62, false, 1, -50001, -50003, -50004, -50002, R.array.f1980_resource_name_obfuscated_res_0x7f030066), context.getResources().getInteger(R.integer.f131630_resource_name_obfuscated_res_0x7f0c005f));
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.ScrubMotionEventHandler, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null) {
            return super.c(hfdVar);
        }
        if (f.c == -500000) {
            Object obj = f.e;
            if (!(obj instanceof Boolean)) {
                ((ltd) ((ltd) c.b()).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionScrubSpaceMotionEventHandler", "consumeEvent", 47, "InlineSuggestionScrubSpaceMotionEventHandler.java")).t("Bad keyData with SMART_COMPOSE_STATUS");
                return true;
            }
            this.d = ((Boolean) obj).booleanValue();
            return true;
        }
        return super.c(hfdVar);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.ScrubMotionEventHandler
    protected final boolean f(MotionEvent motionEvent) {
        if (this.d) {
            jav c2 = hqp.c();
            int i = 2;
            if (c2 != null && c2.C()) {
                i = 1;
            }
            return o(motionEvent, i);
        }
        return false;
    }
}
