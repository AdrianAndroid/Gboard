package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: hoy  reason: default package */
/* loaded from: classes.dex */
public interface hoy extends gzb {
    long B();

    View G();

    ViewGroup K(ice iceVar, boolean z);

    EditorInfo N();

    gqc O();

    hqk R(int i, int i2, int i3);

    hqt S();

    htb T(ibz ibzVar);

    htc U();

    hww V();

    idk Z();

    void aA();

    void aC(ins insVar);

    void aD();

    void aG(int i, int i2);

    void aH(ibz ibzVar);

    void aJ();

    void aK(int i);

    void aN(ice iceVar, hte hteVar);

    void aR(String str);

    void aT(iay iayVar, int i);

    void aU(KeyEvent keyEvent);

    void aV(KeyEvent keyEvent);

    void aW(CharSequence charSequence, int i);

    void aX(CharSequence charSequence, int i, Object obj);

    imn aa();

    iss ab();

    SoftKeyboardView ac(htd htdVar, ViewGroup viewGroup, int i, int i2);

    lmz ad();

    List ae();

    void ah(ice iceVar, hte hteVar);

    void ai();

    void ak();

    void al(CompletionInfo completionInfo);

    void am(CharSequence charSequence, boolean z, int i);

    void ao();

    void ap(int i, int i2);

    void at(hfd hfdVar);

    void aw();

    void ax();

    void az();

    boolean bC(int i, int i2, CharSequence charSequence, boolean z);

    boolean bD(int i, int i2);

    boolean bE();

    boolean bH(int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5);

    ExtractedText bJ();

    CharSequence bM(int i);

    CharSequence bN(int i);

    void bc(ice iceVar, View view);

    void bd(ice iceVar, hth hthVar);

    void bg(int i);

    void bi(int i, int i2);

    void bj(CharSequence charSequence);

    void bl(String str);

    void bm(jav javVar);

    void bn(hox hoxVar);

    void bo();

    boolean bu();

    boolean bz();

    hfi e();

    void hideStatusIcon();

    boolean isFullscreenMode();

    void showStatusIcon(int i);

    float x();

    int y();

    int z();
}
