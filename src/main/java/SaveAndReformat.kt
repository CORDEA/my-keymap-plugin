import com.intellij.codeInsight.actions.ReformatCodeAction
import com.intellij.ide.actions.SaveAllAction
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class SaveAndReformat : AnAction() {
    private val reformatCodeAction = ReformatCodeAction()
    private val saveAllAction = SaveAllAction()

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        if (!project.isOpen) {
            return
        }
        reformatCodeAction.actionPerformed(e)
        saveAllAction.actionPerformed(e)
    }
}
