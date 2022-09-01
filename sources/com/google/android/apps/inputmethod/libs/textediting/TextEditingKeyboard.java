package com.google.android.apps.inputmethod.libs.textediting;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextEditingKeyboard extends Keyboard implements ClipboardManager.OnPrimaryClipChangedListener {
    private int a;
    private final mks b = gyc.b;
    private mko c = mkk.a;
    private final Runnable d = new emq(this, 7);
    private boolean e = false;
    private int f = -1;

    static {
        lug lugVar = hin.a;
    }

    public TextEditingKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    private final void A() {
        if (!this.c.isDone()) {
            this.c.cancel(false);
        }
    }

    private final void H(int i, ExtractedText extractedText) {
        boolean z = i == 1 || i == 2;
        if (extractedText == null || extractedText.text == null) {
            return;
        }
        if (!z) {
            this.v.Q(extractedText.text.length(), extractedText.text.length());
        } else if (this.a == 1) {
            this.v.Q(extractedText.selectionEnd, extractedText.text.length());
        } else {
            this.v.Q(extractedText.selectionStart, extractedText.text.length());
        }
    }

    private final void I(int i, ExtractedText extractedText) {
        boolean z = i == 1 || i == 2;
        if (extractedText == null || extractedText.text == null) {
            return;
        }
        if (!z) {
            this.v.Q(0, 0);
            return;
        }
        int i2 = this.a;
        if (i2 == 1) {
            this.v.Q(0, extractedText.selectionEnd);
        } else if (i2 == 2) {
            this.v.Q(0, extractedText.selectionStart);
        } else {
            this.v.Q(extractedText.selectionStart, 0);
        }
    }

    private final void K(long j) {
        this.v.L(new KeyEvent(j, j, 0, 59, 0, 0, -1, 0, 6, 257));
        hsz hszVar = this.v;
        hfd b = hfd.b();
        b.j(new iay(-10090, null, 0));
        hszVar.z(b);
    }

    private final void L(long j) {
        this.v.L(new KeyEvent(j, j, 1, 59, 0, 0, -1, 0, 6, 257));
    }

    private final void N() {
        A();
        this.c = this.b.a(this.d, 50L, TimeUnit.MILLISECONDS);
    }

    private final boolean O(int i) {
        ExtractedText ag = this.v.ag();
        if (ag != null && ag.selectionStart == ag.selectionEnd) {
            if (ag.selectionStart == 0) {
                if (i != 19) {
                    if (i != 21) {
                        if (i == 22) {
                            return S(ag);
                        }
                    } else if (!S(ag)) {
                        return true;
                    }
                }
                return false;
            } else if (ag.selectionEnd == ag.text.length()) {
                switch (i) {
                    case 20:
                        return false;
                    case 21:
                        return R(ag);
                    case 22:
                        return !R(ag);
                }
            }
        }
        return true;
    }

    private static boolean P(int i) {
        return i != 0;
    }

    private final boolean Q(ExtractedText extractedText) {
        if (extractedText != null) {
            if (TextUtils.isEmpty(extractedText.text)) {
                return true;
            }
            return extractedText.text.toString().contentEquals("\n") && ham.ae(this.D);
        }
        return false;
    }

    private static boolean R(ExtractedText extractedText) {
        String obj = extractedText.text.toString();
        return T(obj.substring(obj.lastIndexOf("\n") + 1));
    }

    private static boolean S(ExtractedText extractedText) {
        if (extractedText == null || extractedText.text == null) {
            return true;
        }
        return T(extractedText.text.toString());
    }

    private static boolean T(String str) {
        return !xj.a().d.a(str, str.length());
    }

    private final void x(ExtractedText extractedText) {
        if (extractedText == null || extractedText.text == null) {
            return;
        }
        this.v.Q(extractedText.selectionEnd, extractedText.selectionEnd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r4 == defpackage.iah.SLIDE_DOWN) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.textediting.TextEditingKeyboard.c(hfd):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getString(R.string.f156390_resource_name_obfuscated_res_0x7f140433);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hsy
    public final void fu(int i, int i2, int i3, int i4) {
        A();
        if (i == i3 && i2 == i4) {
            return;
        }
        int l = l();
        if (!ham.ae(this.D)) {
            this.a = 0;
        } else {
            this.a = 2;
        }
        if (i4 != i3) {
            m(2);
        } else {
            if (i3 == 0) {
                if (i4 != 0) {
                    i3 = 0;
                } else if (Q(this.v.ag())) {
                    m(3);
                    return;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
            }
            if (l == 3) {
                if (i3 != 0 || i4 != 0) {
                    m(0);
                }
            } else if (l == 2) {
                if (this.f == -10087 || Math.abs(i3 - i) + Math.abs(i4 - i2) != 1) {
                    m(0);
                } else {
                    m(1);
                }
            }
        }
        this.f = -1;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        ClipboardManager clipboardManager = (ClipboardManager) this.u.getSystemService("clipboard");
        clipboardManager.addPrimaryClipChangedListener(this);
        this.e = !clipboardManager.hasPrimaryClip();
        A();
        u();
        t(!this.e);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        ((ClipboardManager) this.u.getSystemService("clipboard")).removePrimaryClipChangedListener(this);
        A();
        super.h();
    }

    final int l() {
        long j = this.B & iby.J;
        if (j == 0) {
            return 0;
        }
        if (j == iby.p) {
            return 1;
        }
        if (j == iby.q) {
            return 2;
        }
        return j == iby.r ? 3 : 0;
    }

    final void m(int i) {
        long j = this.B;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 0) {
            L(uptimeMillis);
            al(j, 0L);
        } else if (i == 1) {
            K(uptimeMillis);
            al(j, iby.p);
        } else if (i != 2) {
            L(uptimeMillis);
            al(j, iby.r);
        } else {
            K(uptimeMillis);
            al(j, iby.q);
        }
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        boolean z = !((ClipboardManager) this.u.getSystemService("clipboard")).hasPrimaryClip();
        this.e = z;
        t(!z);
    }

    final void t(boolean z) {
        long j = this.B;
        ak(z ? j | 1099511627776L : j & (-1099511627777L));
    }

    public final void u() {
        ExtractedText ag = this.v.ag();
        if (Q(ag)) {
            m(3);
        } else if (ag == null || ag.selectionStart == ag.selectionEnd) {
            m(0);
        } else {
            m(2);
        }
    }
}
