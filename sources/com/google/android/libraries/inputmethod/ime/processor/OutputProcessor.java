package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OutputProcessor implements hnj, hng {
    private static final lug a = hin.a;
    private hlq b;

    @Override // defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        return false;
    }

    @Override // defpackage.hng
    public final void b(hlq hlqVar) {
        this.b = hlqVar;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        String str;
        int i = hnlVar.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        boolean z = false;
        switch (i2) {
            case 4:
                this.b.g(hnlVar.p, hnlVar.q);
                return true;
            case 5:
                this.b.hY(hnlVar.r);
                return true;
            case 6:
                this.b.T(hnlVar.s);
                return true;
            case 7:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 18:
            case 20:
            case 21:
                luc lucVar = (luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/ime/processor/OutputProcessor", "doProcess", 90, "OutputProcessor.java");
                int i3 = hnlVar.A;
                switch (i3) {
                    case 1:
                        str = "UNKNOWN";
                        break;
                    case 2:
                        str = "IME_ACTIVATE";
                        break;
                    case 3:
                        str = "KEYBOARD_ACTIVATED";
                        break;
                    case 4:
                        str = "HANDLE_EVENT";
                        break;
                    case 5:
                        str = "SET_COMPOSING";
                        break;
                    case 6:
                        str = "UPDATE_TEXT_CANDIDATES";
                        break;
                    case 7:
                        str = "SET_READING_TEXT_CANDIDATES";
                        break;
                    case 8:
                        str = "REQUEST_CANDIDATES";
                        break;
                    case 9:
                        str = "APPEND_TEXT_CANDIDATES";
                        break;
                    case 10:
                        str = "SELECT_READING_TEXT_CANDIDATE";
                        break;
                    case 11:
                        str = "COMMIT_TEXT";
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        str = "SEND_EVENT";
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        str = "SELECT_TEXT_CANDIDATE";
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        str = "FINISH_COMPOSING";
                        break;
                    case 15:
                        str = "CHANGE_KEYBOARD_STATE";
                        break;
                    case 16:
                        str = "KEYBOARD_STATE_CHANGED";
                        break;
                    case 17:
                        str = "SELECTION_CHANGED";
                        break;
                    case 18:
                        str = "FINISH_COMPOSING_TEXT";
                        break;
                    case 19:
                        str = "ABORT_COMPOSING";
                        break;
                    case 20:
                        str = "SET_COMPOSING_REGION";
                        break;
                    case 21:
                        str = "DELETE_CANDIDATE";
                        break;
                    case 22:
                        str = "DISPLAY_COMPLETIONS";
                        break;
                    case 23:
                        str = "REPLACE_TEXT";
                        break;
                    case 24:
                        str = "IME_CLOSE";
                        break;
                    case 25:
                        str = "IME_DEACTIVATE";
                        break;
                    case 26:
                        str = "COMMIT_COMPLETION_TEXT";
                        break;
                    case 27:
                        str = "CURSOR_CAPS_MODE_CHANGED";
                        break;
                    case 28:
                        str = "OFFSET_SELECTION";
                        break;
                    case 29:
                        str = "BEGIN_BATCH_EDIT";
                        break;
                    case 30:
                        str = "END_BATCH_EDIT";
                        break;
                    default:
                        str = "null";
                        break;
                }
                if (i3 == 0) {
                    throw null;
                }
                lucVar.w("The message(type: %s) must be consumed by other processors.", str);
                return false;
            case 8:
                this.b.l(hnlVar.s, hnlVar.t, hnlVar.r);
                return true;
            case 10:
                this.b.hV(hnlVar.p, false, hnlVar.q);
                return true;
            case 11:
                this.b.O(hnlVar.j);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.b.y(hnlVar.w, hnlVar.x);
                return true;
            case 15:
            case 16:
            case 23:
            case 24:
            case 26:
            default:
                return false;
            case 17:
                this.b.hW();
                return true;
            case 19:
                this.b.f(hnlVar.u, hnlVar.v, hnlVar.p);
                return true;
            case 22:
                hlq hlqVar = this.b;
                int i4 = hnlVar.u;
                int i5 = hnlVar.v;
                CharSequence charSequence = hnlVar.p;
                if (hnlVar.B != 1) {
                    z = true;
                }
                hlqVar.hX(i4, i5, charSequence, z);
                return true;
            case 25:
                this.b.hX(Integer.MAX_VALUE, Integer.MAX_VALUE, hnlVar.p, false);
                return true;
            case 27:
                this.b.M(hnlVar.y, hnlVar.z);
                return true;
            case 28:
                this.b.x();
                return true;
            case 29:
                this.b.D();
                return true;
        }
    }
}
