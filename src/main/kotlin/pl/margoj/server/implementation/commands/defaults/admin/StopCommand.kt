package pl.margoj.server.implementation.commands.defaults.admin

import pl.margoj.server.api.commands.Arguments
import pl.margoj.server.api.commands.CommandListener
import pl.margoj.server.api.commands.CommandSender

class StopCommand : CommandListener
{
    override fun commandPerformed(command: String, sender: CommandSender, args: Arguments)
    {
        sender.server.gameLogger.info("${sender.name}: .stop")
        sender.server.shutdown()
    }
}