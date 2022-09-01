package defpackage;

import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: hfq  reason: default package */
/* loaded from: classes.dex */
public interface hfq extends gzb {
    IBinder F();

    View G();

    ViewGroup J();

    EditorInfo M();

    EditorInfo N();

    gqc O();

    hqt S();

    hww V();

    iau W();

    ibz Y();

    idk Z();

    void aJ();

    void aK(int i);

    void aS(int i);

    void aU(KeyEvent keyEvent);

    void aY(CharSequence charSequence);

    void aZ(View view);

    imn aa();

    iss ab();

    SoftKeyboardView ac(htd htdVar, ViewGroup viewGroup, int i, int i2);

    List ae();

    void an(CharSequence charSequence);

    void aq();

    void at(hfd hfdVar);

    void av();

    void ax();

    void ay();

    ExtractedText bJ();

    ExtractedText bK();

    CharSequence bL();

    CharSequence bO();

    void ba(boolean z);

    void bi(int i, int i2);

    void br(hpu hpuVar, boolean z);

    boolean bu();

    boolean isFullscreenMode();

    float x();

    int y();
}
