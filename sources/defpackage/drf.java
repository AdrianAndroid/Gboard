package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoji.search.EmojiSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeBuilderActivity;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: drf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class drf implements lgb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ drf(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ drf(cma cmaVar, int i) {
        this.b = i;
        this.a = cmaVar;
    }

    public /* synthetic */ drf(ContentSuggestionKeyboard contentSuggestionKeyboard, int i) {
        this.b = i;
        this.a = contentSuggestionKeyboard;
    }

    public /* synthetic */ drf(EmojiSearchResultKeyboard emojiSearchResultKeyboard, int i) {
        this.b = i;
        this.a = emojiSearchResultKeyboard;
    }

    public /* synthetic */ drf(GifKeyboardM2 gifKeyboardM2, int i) {
        this.b = i;
        this.a = gifKeyboardM2;
    }

    public /* synthetic */ drf(GifKeyboardTablet gifKeyboardTablet, int i) {
        this.b = i;
        this.a = gifKeyboardTablet;
    }

    public /* synthetic */ drf(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public /* synthetic */ drf(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    public /* synthetic */ drf(ThemeBuilderActivity themeBuilderActivity, int i) {
        this.b = i;
        this.a = themeBuilderActivity;
    }

    public /* synthetic */ drf(Keyboard keyboard, int i) {
        this.b = i;
        this.a = keyboard;
    }

    public /* synthetic */ drf(ctu ctuVar, int i) {
        this.b = i;
        this.a = ctuVar;
    }

    public /* synthetic */ drf(dtl dtlVar, int i) {
        this.b = i;
        this.a = dtlVar;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [cma, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [cma, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [ctu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [ctu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [ctu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [ctu, java.lang.Object] */
    @Override // defpackage.lgb
    public final Object a() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                lug lugVar = dri.a;
                dre dreVar = dre.a;
                if (dreVar == null) {
                    synchronized (dre.class) {
                        dreVar = dre.a;
                        if (dreVar == null) {
                            Context applicationContext = ((Context) obj).getApplicationContext();
                            dreVar = new dre(gxo.a(10), gyk.i(applicationContext), new dsg(dsn.n(applicationContext, dso.a)));
                            dre.a = dreVar;
                        }
                    }
                }
                return dreVar;
            case 1:
                Object obj2 = this.a;
                lug lugVar2 = dri.a;
                drj drjVar = drj.a;
                if (drjVar == null) {
                    synchronized (drj.class) {
                        drjVar = drj.a;
                        if (drjVar == null) {
                            Context applicationContext2 = ((Context) obj2).getApplicationContext();
                            drjVar = new drj(gxo.a(10), ikj.C(applicationContext2), new dsg(dsn.n(applicationContext2, dso.a)));
                            drj.a = drjVar;
                        }
                    }
                }
                return drjVar;
            case 2:
                return ((dtl) this.a).k;
            case 3:
                return (AudioManager) ((Context) this.a).getSystemService("audio");
            case 4:
                return Boolean.valueOf(((Keyboard) this.a).C);
            case 5:
                return Boolean.valueOf(((Keyboard) this.a).C);
            case 6:
                return hbd.h((Context) this.a);
            case 7:
                return new kcq((Context) this.a, (byte[]) null, (byte[]) null);
            case 8:
                return ((AbstractSearchResultKeyboard) this.a).U();
            case 9:
                return Boolean.valueOf(((Keyboard) this.a).C);
            case 10:
                return this.a.a();
            case 11:
                return this.a.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Boolean.valueOf(((Keyboard) this.a).C);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Boolean.valueOf(this.a.fq());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(this.a.fq());
            case 15:
                return Boolean.valueOf(this.a.fq());
            case 16:
                return Boolean.valueOf(this.a.fq());
            case 17:
                return Boolean.valueOf(((Keyboard) this.a).C);
            case 18:
                return Boolean.valueOf(((Keyboard) this.a).C);
            case 19:
                gwg a = gwj.a((Context) this.a, "theme_builder");
                a.c();
                a.b();
                a.d();
                return a.a();
            default:
                Object obj3 = this.a;
                int i = eqx.a;
                gwg a2 = gwj.a((Context) obj3, "stylesheet");
                a2.c();
                a2.b();
                return new gwk(a2.a(), new gwq(euw.c.t()));
        }
    }
}
