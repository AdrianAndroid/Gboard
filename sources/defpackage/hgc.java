package defpackage;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.emoji.widget.EmojiExtractTextLayout;
import androidx.emoji.widget.ExtractButtonCompat;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.extracttextview.ExtractTextLayout;

/* compiled from: PG */
/* renamed from: hgc  reason: default package */
/* loaded from: classes.dex */
public final class hgc implements hgd {
    private final /* synthetic */ int a;
    private LinearLayout b;

    public hgc(int i) {
        this.a = i;
    }

    @Override // defpackage.hgd
    public final View a(InputMethodService inputMethodService) {
        if (this.a == 0) {
            EmojiExtractTextLayout emojiExtractTextLayout = (EmojiExtractTextLayout) inputMethodService.getLayoutInflater().cloneInContext(hqs.d(inputMethodService)).inflate(R.layout.f134040_resource_name_obfuscated_res_0x7f0e0075, (ViewGroup) null);
            this.b = emojiExtractTextLayout;
            return emojiExtractTextLayout;
        }
        ExtractTextLayout extractTextLayout = (ExtractTextLayout) inputMethodService.getLayoutInflater().cloneInContext(hqs.d(inputMethodService)).inflate(R.layout.f133910_resource_name_obfuscated_res_0x7f0e005f, (ViewGroup) null);
        this.b = extractTextLayout;
        return extractTextLayout;
    }

    @Override // defpackage.hgd
    public final void b(InputMethodService inputMethodService, EditorInfo editorInfo) {
        if (this.a != 0) {
            LinearLayout linearLayout = this.b;
            if (linearLayout == null || !inputMethodService.isExtractViewShown()) {
                return;
            }
            ExtractTextLayout extractTextLayout = (ExtractTextLayout) linearLayout;
            if (extractTextLayout.b == null) {
                return;
            }
            if (editorInfo.actionLabel == null && ((editorInfo.imeOptions & 255) == 1 || (536870912 & editorInfo.imeOptions) != 0 || editorInfo.inputType == 0)) {
                extractTextLayout.b.setVisibility(8);
                Button button = extractTextLayout.a;
                if (button == null) {
                    return;
                }
                button.setOnClickListener(null);
                return;
            }
            extractTextLayout.b.setVisibility(0);
            if (extractTextLayout.a == null) {
                return;
            }
            if (editorInfo.actionLabel != null) {
                extractTextLayout.a.setText(editorInfo.actionLabel);
            } else {
                extractTextLayout.a.setText(inputMethodService.getTextForImeAction(editorInfo.imeOptions));
            }
            Button button2 = extractTextLayout.a;
            if (extractTextLayout.c == null) {
                extractTextLayout.c = new dbg(inputMethodService, 2);
            }
            button2.setOnClickListener(extractTextLayout.c);
            return;
        }
        LinearLayout linearLayout2 = this.b;
        if (linearLayout2 == null || !inputMethodService.isExtractViewShown()) {
            return;
        }
        EmojiExtractTextLayout emojiExtractTextLayout = (EmojiExtractTextLayout) linearLayout2;
        if (emojiExtractTextLayout.b == null) {
            return;
        }
        if (editorInfo.actionLabel == null && ((editorInfo.imeOptions & 255) == 1 || (536870912 & editorInfo.imeOptions) != 0 || editorInfo.inputType == 0)) {
            emojiExtractTextLayout.b.setVisibility(8);
            ExtractButtonCompat extractButtonCompat = emojiExtractTextLayout.a;
            if (extractButtonCompat == null) {
                return;
            }
            extractButtonCompat.setOnClickListener(null);
            return;
        }
        emojiExtractTextLayout.b.setVisibility(0);
        if (emojiExtractTextLayout.a == null) {
            return;
        }
        if (editorInfo.actionLabel != null) {
            emojiExtractTextLayout.a.setText(editorInfo.actionLabel);
        } else {
            emojiExtractTextLayout.a.setText(inputMethodService.getTextForImeAction(editorInfo.imeOptions));
        }
        ExtractButtonCompat extractButtonCompat2 = emojiExtractTextLayout.a;
        if (emojiExtractTextLayout.c == null) {
            emojiExtractTextLayout.c = new dbg(inputMethodService, 1);
        }
        extractButtonCompat2.setOnClickListener(emojiExtractTextLayout.c);
    }
}
