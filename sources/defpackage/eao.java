package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eao  reason: default package */
/* loaded from: classes.dex */
public final class eao extends dbn implements IEmojiSearchExtension, htb, hho {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiExtension");
    private dbr i;
    private boolean j = true;

    @Override // defpackage.dbn
    protected final ids D() {
        return ctg.EMOJI_SEARCH_EXTENSION_SHOWN_TIME;
    }

    @Override // defpackage.dbn, defpackage.hgb
    public final ids U(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return ctg.EXT_EMOJI_DEACTIVATE;
            }
            if (i2 == 2) {
                return ctg.EXT_EMOJI_KB_ACTIVATE;
            }
            if (i2 != 3) {
                return ctg.EXT_EMOJI_2ND_OR_LATER_STARTUP;
            }
            return ctg.EXT_EMOJI_1ST_STARTUP;
        }
        return ctg.EXT_EMOJI_ACTIVATE;
    }

    @Override // defpackage.dbn, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        return false;
    }

    @Override // defpackage.dbn
    protected final int d() {
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiExtension", "getExtensionViewDefId", 53, "LiteEmojiExtension.java")).t("getExtensionViewDefId() : Should not be called for Gboard Go.");
        return 0;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        this.j = false;
        this.i = new dbr(this, this.c, R.xml.f210090_resource_name_obfuscated_res_0x7f170104);
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        hhq.o(this, ean.f);
        this.i = new dbr(this, context, R.xml.f210090_resource_name_obfuscated_res_0x7f170104);
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        this.i = null;
        hhq.q(this);
        super.gn();
    }

    @Override // defpackage.htb
    public final boolean s(ibz ibzVar) {
        return this.j;
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.i;
        if (dbrVar == null) {
            htaVar.a(ibzVar, null, null);
        } else {
            dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, htaVar);
        }
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }
}
