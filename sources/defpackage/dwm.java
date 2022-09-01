package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.inputmethod.latin.R;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: dwm  reason: default package */
/* loaded from: classes.dex */
public final class dwm extends dvk implements gza {
    public final Context a;
    private final hsk b;
    private dwq c;
    private dwj d;

    public dwm(Context context, hsk hskVar) {
        this.a = context;
        this.b = hskVar;
    }

    private static Optional b(CursorAnchorInfo cursorAnchorInfo) {
        if (Float.isNaN(cursorAnchorInfo.getInsertionMarkerHorizontal())) {
            return Optional.empty();
        }
        RectF rectF = new RectF(cursorAnchorInfo.getInsertionMarkerHorizontal(), cursorAnchorInfo.getInsertionMarkerTop(), cursorAnchorInfo.getInsertionMarkerHorizontal(), cursorAnchorInfo.getInsertionMarkerBottom());
        cursorAnchorInfo.getMatrix().mapRect(rectF);
        Rect rect = new Rect();
        rectF.round(rect);
        return Optional.of(rect);
    }

    @Override // defpackage.gza
    public final void a(CursorAnchorInfo cursorAnchorInfo) {
        Optional b;
        dwj dwjVar = this.d;
        if (dwjVar == null || this.c != null) {
            return;
        }
        CharSequence composingText = cursorAnchorInfo.getComposingText();
        if (composingText == null) {
            b = b(cursorAnchorInfo);
        } else {
            int composingTextStart = cursorAnchorInfo.getComposingTextStart();
            int length = composingText.length();
            if (length == 0 || composingTextStart == -1) {
                b = b(cursorAnchorInfo);
            } else {
                RectF characterBounds = cursorAnchorInfo.getCharacterBounds(composingTextStart);
                if (characterBounds == null) {
                    b = b(cursorAnchorInfo);
                } else {
                    for (int i = composingTextStart + 1; i < composingTextStart + length; i++) {
                        RectF characterBounds2 = cursorAnchorInfo.getCharacterBounds(i);
                        if (characterBounds2 != null) {
                            if (characterBounds2.top >= characterBounds.bottom) {
                                break;
                            }
                            characterBounds.union(characterBounds2);
                        } else {
                            b = b(cursorAnchorInfo);
                            break;
                        }
                    }
                    cursorAnchorInfo.getMatrix().mapRect(characterBounds);
                    Rect rect = new Rect();
                    characterBounds.round(rect);
                    b = Optional.of(rect);
                }
            }
        }
        if (b.isEmpty()) {
            j();
            return;
        }
        Rect rect2 = (Rect) b.get();
        int centerX = rect2.centerX();
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.f41300_resource_name_obfuscated_res_0x7f0705b2);
        int i2 = rect2.top;
        int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.f41310_resource_name_obfuscated_res_0x7f0705b3);
        hky a = hlf.a();
        a.p("NGA_TEXT_TIP");
        a.g(this.a.getString(R.string.f158740_resource_name_obfuscated_res_0x7f140570));
        a.m = 1;
        a.f(R.id.input_area);
        final int i3 = centerX + dimensionPixelOffset;
        final int i4 = i2 + dimensionPixelOffset2;
        a.d = new hld() { // from class: dwl
            @Override // defpackage.hld
            public final hlc a(View view) {
                dwm dwmVar = dwm.this;
                int i5 = i3;
                int i6 = i4;
                view.measure(View.MeasureSpec.makeMeasureSpec(gvv.f(dwmVar.a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gvv.d(dwmVar.a), Integer.MIN_VALUE));
                return hlc.a(0, i5, i6 - view.getMeasuredHeight());
            }
        };
        dwq dwqVar = new dwq(this.a, a);
        this.c = dwqVar;
        dwqVar.k(dwjVar, null);
    }

    @Override // defpackage.dwk
    public final void j() {
        if (this.d == null) {
            return;
        }
        dwq dwqVar = this.c;
        if (dwqVar != null) {
            dwqVar.j();
            this.c = null;
        }
        this.d = null;
    }

    @Override // defpackage.dwk
    public final boolean k(dwj dwjVar, Runnable runnable) {
        j();
        this.d = dwjVar;
        this.b.aO(this);
        return true;
    }
}
