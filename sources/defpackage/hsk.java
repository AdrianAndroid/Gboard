package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: hsk  reason: default package */
/* loaded from: classes.dex */
public interface hsk extends inf, gzb {
    Context C();

    Context D();

    Configuration E();

    IBinder F();

    View G();

    View H();

    View I();

    ViewGroup L(ice iceVar);

    EditorInfo M();

    EditorInfo N();

    gqc O();

    @Deprecated
    hox P();

    hpl Q();

    htc U();

    hww V();

    void aP(ibz ibzVar, hov hovVar);

    imn aa();

    void an(CharSequence charSequence);

    void aq();

    void at(hfd hfdVar);

    void au(Printer printer, boolean z);

    void av();

    void az();

    boolean bR(aqq aqqVar);

    void bS(opu opuVar);

    void bb(hwp hwpVar);

    void be(boolean z, ice iceVar);

    void bf(gzr gzrVar);

    void bh(hsl hslVar);

    @Deprecated
    void bk();

    void br(hpu hpuVar, boolean z);

    boolean bv();

    boolean by();

    Context getApplicationContext();

    Dialog getWindow();

    boolean isFullscreenMode();

    void onDisplayCompletions(CompletionInfo[] completionInfoArr);

    void switchInputMethod(String str);

    void switchInputMethod(String str, InputMethodSubtype inputMethodSubtype);

    int y();
}
