package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonRecyclerView;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.richsymbol.RichSymbolKeyboard;
import com.google.android.apps.inputmethod.libs.search.richsymbol.RichSymbolRecyclerView;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: edy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class edy implements ela {
    public final /* synthetic */ LifecycleKeyboard a;
    private final /* synthetic */ int b;

    public /* synthetic */ edy(EmoticonKeyboardM2 emoticonKeyboardM2, int i) {
        this.b = i;
        this.a = emoticonKeyboardM2;
    }

    public /* synthetic */ edy(GifKeyboardM2 gifKeyboardM2, int i) {
        this.b = i;
        this.a = gifKeyboardM2;
    }

    public /* synthetic */ edy(GifKeyboardTablet gifKeyboardTablet, int i) {
        this.b = i;
        this.a = gifKeyboardTablet;
    }

    public /* synthetic */ edy(RichSymbolKeyboard richSymbolKeyboard, int i) {
        this.b = i;
        this.a = richSymbolKeyboard;
    }

    @Override // defpackage.ela
    public final void hz(CategoryViewPager categoryViewPager, View view, int i, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            LifecycleKeyboard lifecycleKeyboard = this.a;
            if (!TextUtils.isEmpty(((AbstractSearchResultKeyboard) lifecycleKeyboard).U()) || i2 == 2) {
                return;
            }
            GifKeyboardM2 gifKeyboardM2 = (GifKeyboardM2) lifecycleKeyboard;
            cou couVar = gifKeyboardM2.f;
            if (couVar != null) {
                couVar.i(cox.b(i));
            }
            boe boeVar = gifKeyboardM2.m;
            if (boeVar != null) {
                boeVar.l(i);
            }
            gifKeyboardM2.L((VerticalScrollAnimatedImageSidebarHolderView) aad.q(view, R.id.f52360_resource_name_obfuscated_res_0x7f0b007b), (ViewGroup) aad.q(view, R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5), i);
            if (i2 != 4) {
                return;
            }
            gifKeyboardM2.R(gifKeyboardM2.u(i), 4);
        } else if (i3 == 1) {
            LifecycleKeyboard lifecycleKeyboard2 = this.a;
            if (i == 0) {
                View x = categoryViewPager.x(0);
                if (x instanceof EmoticonRecyclerView) {
                    EmoticonKeyboardM2 emoticonKeyboardM2 = (EmoticonKeyboardM2) lifecycleKeyboard2;
                    emoticonKeyboardM2.H((EmoticonRecyclerView) x, emoticonKeyboardM2.u(0));
                }
                i = 0;
            }
            EmoticonKeyboardM2 emoticonKeyboardM22 = (EmoticonKeyboardM2) lifecycleKeyboard2;
            cou couVar2 = emoticonKeyboardM22.h;
            if (couVar2 == null) {
                return;
            }
            couVar2.i(cox.b(i));
            ((RecyclerView) view).Y(0);
            emoticonKeyboardM22.K(i, i2);
        } else if (i3 != 2) {
            LifecycleKeyboard lifecycleKeyboard3 = this.a;
            if (i == 0) {
                View x2 = categoryViewPager.x(0);
                if (x2 instanceof RichSymbolRecyclerView) {
                    ((RichSymbolKeyboard) lifecycleKeyboard3).m((RichSymbolRecyclerView) x2, 0);
                }
                i = 0;
            }
            RichSymbolKeyboard richSymbolKeyboard = (RichSymbolKeyboard) lifecycleKeyboard3;
            cou couVar3 = richSymbolKeyboard.f;
            if (couVar3 != null) {
                couVar3.i(cox.b(i));
                ((RecyclerView) view).Y(0);
                String str = (String) ((lct) RichSymbolKeyboard.b.get(i)).d;
                richSymbolKeyboard.d.j("pref_key_rich_symbol_last_category_opened", str);
                idk idkVar = richSymbolKeyboard.c;
                ctd ctdVar = ctd.CATEGORY_SWITCH;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 6;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.c = 1;
                mbcVar2.a |= 2;
                nfh t2 = mbb.g.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbb mbbVar = (mbb) t2.b;
                int i4 = 1 | mbbVar.a;
                mbbVar.a = i4;
                mbbVar.b = str;
                int i5 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                mbbVar.c = i5;
                int i6 = i4 | 2;
                mbbVar.a = i6;
                mbbVar.a = i6 | 4;
                mbbVar.d = i;
                mba mbaVar = i == 0 ? mba.RECENTS : mba.UNKNOWN;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbb mbbVar2 = (mbb) t2.b;
                mbbVar2.e = mbaVar.e;
                mbbVar2.a |= 8;
                mbb mbbVar3 = (mbb) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar3 = (mbc) t.b;
                mbbVar3.getClass();
                mbcVar3.e = mbbVar3;
                mbcVar3.a |= 8;
                objArr[0] = t.cz();
                idkVar.e(ctdVar, objArr);
            }
            boe boeVar2 = richSymbolKeyboard.g;
            if (boeVar2 == null) {
                return;
            }
            boeVar2.l(i);
        } else {
            LifecycleKeyboard lifecycleKeyboard4 = this.a;
            if (!TextUtils.isEmpty(((AbstractSearchResultKeyboard) lifecycleKeyboard4).U()) || i2 == 2) {
                return;
            }
            GifKeyboardTablet gifKeyboardTablet = (GifKeyboardTablet) lifecycleKeyboard4;
            gifKeyboardTablet.K((VerticalScrollAnimatedImageSidebarHolderView) aad.q(view, R.id.f52360_resource_name_obfuscated_res_0x7f0b007b), (ViewGroup) aad.q(view, R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5), i);
            if (i2 != 4) {
                return;
            }
            gifKeyboardTablet.Q(gifKeyboardTablet.t(i), 4);
        }
    }
}
